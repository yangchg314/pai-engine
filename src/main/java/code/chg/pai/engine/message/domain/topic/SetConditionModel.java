package code.chg.pai.engine.message.domain.topic;

import java.util.Set;

public class SetConditionModel implements ConditionModel{
    Set<Object> elements;
    @Override
    public boolean satisfy(Object object) {
        if(elements.contains(object)) {
            return true;
        }
        return false;
    }
}
