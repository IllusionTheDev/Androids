package me.imillusion.androids.data;

import me.imillusion.androids.data.actions.LookAction;
import me.imillusion.androids.data.actions.MoveAction;
import me.imillusion.androids.data.actions.specific.MinerAction;
import me.imillusion.androids.data.common.AndroidAction;

import java.util.ArrayList;
import java.util.List;

public class ActionManager {

    private List<AndroidAction> actions = new ArrayList<>();

    public AndroidAction getAction(String name) {
        return actions.stream().filter(a -> a.toString().equalsIgnoreCase(name)).findFirst().get();
    }

    public void register(AndroidAction... actions) {
        for (AndroidAction action : actions) {
            if (getAction(action.toString()) != null)
                return;
            this.actions.add(action);
        }
    }

    public ActionManager() {
        register(MoveAction.values());
        register(LookAction.values());
        register(MinerAction.values());
    }

}
