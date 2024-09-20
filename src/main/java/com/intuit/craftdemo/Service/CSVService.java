package com.intuit.craftdemo.Service;

import com.intuit.craftdemo.Models.Person;
import com.opencsv.CSVReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CSVService {
    private Map<String, Person> personMap = new HashMap<>();

    public CSVService() {
        loadCsvData();
    }

    // Load CSV data into a HashMap
    private void loadCsvData() {
        try (CSVReader csvReader = new CSVReader(
                new InputStreamReader(new ClassPathResource("people.csv").getInputStream()))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                Person person = new Person(values[0], values[1], values[2]);
                personMap.put(values[0], person); // Assuming the first column is the primary key (id)
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Person> getAllPeople() {
        return new ArrayList<>(personMap.values());
    }

    public Person getPersonById(String id) {
        return personMap.get(id);
    }
}

