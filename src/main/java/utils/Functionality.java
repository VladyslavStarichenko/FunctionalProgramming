package utils;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Laureate;
import model.LaureateList;
import java.util.*;
import java.io.IOException;
import java.net.URL;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.String.*;

public class Functionality {

    public Map<String, Double> getGenderDistributionList() throws IOException {
        Map<String, Double> genderDistributionList = new HashMap<>();
        List<Laureate> laureates = getLaureateList();
        Function<Long, Double> getStatistics = genderPercent -> (double) genderPercent / laureates.size() * 100;
        Map<String, List<Laureate>> genderMap = genderMap(laureates);
        List<String> genders = new ArrayList<>(genderMap.keySet());
        genders.forEach(gender -> {
            Double percent = getStatistics.apply(
                    laureates.
                            stream()
                            .filter(laureate -> laureate.getGender().equals(valueOf(gender)))
                            .count());
            genderDistributionList.put(valueOf(gender), percent);

        });
        return genderDistributionList;
    }

    public void printInterest(Map<String, Double> interest) throws IOException {

        Predicate<String> isOrganization = isOrg -> isOrg.equals("org");
        Predicate<String> isMale = isM -> isM.equals("male");
        Predicate<String> isFemale = isF -> isF.equals("female");

        System.out.println("Statistic of interest for Nobel laureates");
        interest.forEach((key, value) -> {
            if(isFemale.test(key)){
                key = "Female";
            }else if(isOrganization.test(key)){
                key = "Organization";
            }
            else if(isMale.test(key)){
                key = "Male";
            }
            System.out.printf("-> %s : %s%%%n",key, value);
        });
    }

    public void printAllLaureates() throws IOException {
        List<Laureate> laureates = getLaureateList();
        laureates.forEach(System.out::println);
        getAliveGenderGrouping();
    }

    public List<Laureate> getLaureateList() throws IOException {
        String jsonUrl = "http://api.nobelprize.org/v1/laureate.json";
        URL url = new URL(jsonUrl);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT, true);
        LaureateList laureates = objectMapper.readValue(url, LaureateList.class);
        return laureates.getLaureates();
    }

    public void getAliveGenderGrouping() throws IOException {
        List<Laureate> laureates = getLaureateList();
        Predicate<Laureate> normalGenders = laureate ->
                laureate.getGender().equals("male") || laureate.getGender().equals("female");

        Map<String, List<Laureate>> sortedAliveAlphabet = laureates.stream()
                .filter(normalGenders)
                .sorted(Comparator.comparing(Laureate::getDied).thenComparing(Laureate::getFirstname))
                .collect(Collectors.groupingBy(Laureate::getGender));

        sortedAliveAlphabet.forEach((gender, laureates1) -> {
            System.out.println(gender);
            laureates1.forEach(System.out::println);
            System.out.println();
        });

    }

    public static Map<String, List<Laureate>> genderMap(List<Laureate> laureates) {
        return laureates.stream()
                .collect(Collectors.groupingBy(Laureate::getGender));
    }




}
