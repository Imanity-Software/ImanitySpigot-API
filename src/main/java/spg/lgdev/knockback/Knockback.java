package spg.lgdev.knockback;

import java.util.Map;

public interface Knockback<P, K, R, A> {

    void attack(P victim, P attacker, int multiplier, double[] victimMot);

    void attackRegular(K victim, K attacker, float damage, double xo, double zo);

    void roding(P victim, K attacker, R rod);

    void bow(P victim, K attacker, A arrow);

    void hook(R rod, double d0, double d1);

    String getName();

    void setName(String name);

    boolean isEditable();

    void setEditable(boolean editable);

    void save();

    void load(Map<String, Object> index);

    String moduleName();

    int hitDelay();

    float potFallSpeed();

    float potThrowMultiplier();

    float potOffSet();

    boolean hasValue(String value);

    boolean setValue(String key, String value);

    Object getValue(String value);

    Map<String, Object> getValues();

}
