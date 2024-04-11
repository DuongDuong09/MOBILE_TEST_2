package DataTest;

public class DataTestBody {
    private int stt;
    private String scenario;
    private String testacseID;
    private String testcasename;
    public DataTestBody(){
        super();
    }
    public DataTestBody(int stt, String testacseID, String scenario, String testcasename ){
        this.stt=stt;
        this.testacseID=testacseID;
        this.scenario=scenario;
        this.testcasename=testcasename;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setTestcaseID(String testacseID) {
        this.testacseID = testacseID;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public void setTestcasename(String testcasename) {
        this.testcasename = testcasename;
    }


    public int getStt() {
        return stt;
    }
    public String getTestcaseID() {
        return testacseID;
    }

    public String getScenario() {
        return scenario;
    }


    public String getTestcasename() {
        return testcasename;
    }

}
