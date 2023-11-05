package code.chg.pai.engine.message.domain.topic;

import lombok.Builder;

import java.util.Map;

@Builder
public class ConditionModelConfiguration {
    ConditionRelation conditionRelation;
    Map<String,ConditionModel> ConditionModelContains;
    boolean satisfy(Map<String,Object> eventDetail) {
        return false;
    }
}
