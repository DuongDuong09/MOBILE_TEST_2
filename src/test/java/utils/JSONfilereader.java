package utils;

import DataTest.DataTestBody;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JSONfilereader {
    public static DataTestBody getTestcase(String testcaseID, String pathJsonFile) throws IOException {
        DataTestBody user=new DataTestBody();
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        List<DataTestBody> userList=objectMapper.readValue(Paths.get(pathJsonFile).toFile(),
                new TypeReference<List<DataTestBody>>() {
                });
        for (DataTestBody emp: userList){
            if(emp.getTestcaseID().equals(testcaseID)){
                user =new DataTestBody(emp.getStt(),testcaseID,emp.getScenario(), emp.getTestcasename());
                break;
            }
        }
        return user;
    }
}
