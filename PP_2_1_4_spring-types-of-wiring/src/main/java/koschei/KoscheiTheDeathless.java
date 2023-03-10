package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("kosheiBean")
@Scope("singleton")
//@Scope("prototype")
public class KoscheiTheDeathless {

    private Ocean1 ocean;

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }
}
