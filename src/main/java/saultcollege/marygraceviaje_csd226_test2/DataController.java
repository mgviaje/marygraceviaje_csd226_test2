package saultcollege.marygraceviaje_csd226_test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class DataController {
    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/samplestring")
    public ResponseEntity<String> getStringData() {
        Data person1 = new Data("Aya", 30);

        String person="Returning the person's name as : " + person1.getName() + "<br>" + "<br> And returning the person's ID number as :";


        return ResponseEntity.ok(person);


    }

    @GetMapping("/sampleint")
    public ResponseEntity<Integer> getIntegerData() {

        Data person2 = new Data("Aya", 30);

        Integer personNum = person2.getDataKey();

        return ResponseEntity.ok(personNum);

    }

    @GetMapping("/data/int")
    public List<Data> getIntData() {

        Data intData1 = new Data("Grace", 10);
        dataRepository.saveAll(Arrays.asList(intData1));

        return dataRepository.findAll();
    }

    @GetMapping("/data/string")
    public List<Data> getStrData() {
        // Add sample string data
        Data stringData1 = new Data("Aya", 30);
        dataRepository.saveAll(Arrays.asList(stringData1));

        return dataRepository.findAll();
    }



}