package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("needleBean")
public class Needle7 {

   @Autowired
    private Deth8 deth;

//    @Autowired
//    public void setDeth8(Deth8 deth){
//        this.deth = deth;
//    }

//    @Autowired
//    public Needle7(Deth8 deth){
//        this.deth = deth;
//    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + "";
    }
}
