package me.imillusion.androids.data.common;

import java.util.ArrayList;
import java.util.UUID;

public interface Android {

    String getName();
    UUID getOwner();
    String getIdentifier();
    ArrayList<AndroidAction> getActions();
}
