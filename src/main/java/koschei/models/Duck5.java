package koschei.models;

import org.springframework.stereotype.Component;


@Component
public class Duck5 {

    private Egg6 egg;

    public Duck5(Egg6 egg6) {
        this.egg = egg6;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + egg;
    }
}
