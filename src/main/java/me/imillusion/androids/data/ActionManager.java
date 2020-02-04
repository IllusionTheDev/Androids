package me.imillusion.androids.data;

import me.imillusion.androids.androids.miner.MinerAndroid;
import me.imillusion.androids.data.actions.LookAction;
import me.imillusion.androids.data.actions.MoveAction;
import me.imillusion.androids.androids.miner.MinerAction;
import me.imillusion.androids.data.common.AndroidAction;
import me.imillusion.androids.data.common.AndroidModel;

import java.util.*;

public class ActionManager {

    private List<AndroidAction> actions = new ArrayList<>();
    private Map<AndroidModel, Set<AndroidAction>> specificActions = new TreeMap<>();

    public AndroidAction getAction(String name) {
        return actions.stream().filter(a -> a.toString().equalsIgnoreCase(name)).findFirst().get();
    }

    public void register(AndroidAction... actions) {
        for (AndroidAction action : actions) {
            if (getAction(action.toString()) != null)
                continue;
            this.actions.add(action);
        }
    }

    public void registerSpecific(AndroidModel model, AndroidAction... actions)
    {
        for (AndroidAction action : actions) {
            if (getAction(action.toString()) != null)
                continue;

            Set<AndroidAction> set = specificActions.getOrDefault(model, new HashSet<>());
            set.add(action);
            specificActions.put(model, set);
        }
    }

    public ActionManager() {
        register(MoveAction.values());
        register(LookAction.values());
        
        registerSpecific(new MinerAndroid(), MinerAction.values());
    }

    public Set<AndroidAction> getAvailableActions(AndroidModel model)
    {
        Set<AndroidAction> set = new HashSet<>();
        set.addAll(actions);
        set.addAll(specificActions.getOrDefault(model, new HashSet<>()));

        return set;
    }

}
