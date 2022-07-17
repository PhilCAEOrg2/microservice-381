package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class User1 {

    public User1() {}
    
    private boolean b;

    public void setb(boolean setValue) {
        this.b = setValue;
    }

    public boolean getb() {
        return this.b;
    }
    private String name;

    public void setname(String setValue) {
        this.name = setValue;
    }

    public String getname() {
        return this.name;
    }
    private int id;

    public void setid(int setValue) {
        this.id = setValue;
    }

    public int getid() {
        return this.id;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("b", this.b); 
        jo.put("name", this.name); 
        jo.put("id", this.id); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.b = (1 == ((Long) jsonObject.get("b")).intValue()); 
        this.name = (String) jsonObject.get("name"); 
        this.id = ((Long) jsonObject.get("id")).intValue(); 

    }

}

    
}
