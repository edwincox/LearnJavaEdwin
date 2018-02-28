package opdrachtinterface.zelf.challange;

import java.util.List;

public interface ISaveable {

    List<String> winkey();

    void read(List<String> savedValues);

}