package spg.lgdev.knockback;

public class KnockbackHandler {
    /**
     * Sets the default knockback profile to the one specified
     * @param knockback - The knockback profile which would become the new default one
     */
    public void setDefaultKnockback(Knockback knockback) {
    }

    /**
     * Registers a new knockback profile
     * @param knockback - The knockback profile to be registered later
     */
    public void registerProfile(Knockback knockback) { }

    /**
     * Unregisters a new knockback profile
     * @param knockback - The knockback profile to be unregistered later
     */
    public void unregisterProfile(Knockback knockback) {
    }

    /**
     * Obtain an existing knockback profile in the server
     * @param name - The profile name specified
     * @return null if the knockback profile does not exist in the server, otherwise the knockback profile instance with specified name (Case-Insensitive)
     */
    public Knockback getKnockbackProfile(String name) {
        return null;
    }

    /**
     * Registers a new knockback module, which provides a custom algorithm
     * @param name - The module name specified, cannot duplicate the existing module names
     * @param module - The target module class
     */
    public void registerModule(String name, Class<? extends Knockback> module) {

    }

    /**
     * Obtains an existing knockback module in the server
     * @param name - The name specified
     * @return null if the knockback module does not exist in the server, otherwise the knockback module class
     */
    public Class<? extends Knockback> getModule(String name) {
        return null;
    }

    /**
     * Unregisters an existing knockback module in the server
     * @param name - The name specified
     */
    public void unregisterModule(String name) {
    }

    /**
     * Reloads the knockback handler
     * This will reload everything (Including profiles, modules, etc.)
     */
    public void reload() {
    }
}
