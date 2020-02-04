package me.imillusion.androids.functions;

import me.imillusion.androids.data.common.AndroidModel;

import java.util.Set;
import java.util.TreeSet;

public class AndroidManager {

    private Set<AndroidModel> models = new TreeSet<>();

    public void register(AndroidModel model)
    {
        models.add(model);
    }

}
