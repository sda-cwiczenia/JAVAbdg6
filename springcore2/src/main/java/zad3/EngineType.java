package zad3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("setting.properties")
public class EngineType {
    private String engineType;

    public EngineType() {
    }

    public EngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }


    @Value("${engin_type}")
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "EngineType{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
