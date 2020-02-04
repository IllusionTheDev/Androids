package me.imillusion.androids.data.common;

import java.util.ArrayList;
import java.util.UUID;

public interface Android {

    default String getName() {
        return getModel().getName();
    }
    default String getIdentifier() {
        return getModel().getIdentifier();
    }

    UUID getOwner();

    AndroidModel getModel();
    ArrayList<AndroidAction> getActions();
}
