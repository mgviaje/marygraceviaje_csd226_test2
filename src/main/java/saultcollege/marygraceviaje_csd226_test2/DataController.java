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

    @GetMapping("/sample")
    public ResponseEntity<String> getStringData() {

        String s="" +
                "<form hx-post=\"/data/string\" hx-target=\"this\" hx-swap=\"outerHTML\">" +
                "<h1></h1>" +
                "    <div>" +
                "        <label>Name</label>" +
                "        <input type=\"text\" name=\"Name\" value=\"Mgrace\">" +
                "    </div>" +
                "    <button class=\"btn\">Submit</button>" +
                "    <button class=\"btn\" hx-get=\"/data/string\">Cancel</button>" +
                "</form>";

        Data person1 = new Data("Aya", 30);
        return ResponseEntity.ok(s + person1);


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