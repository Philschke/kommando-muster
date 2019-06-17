package com.muster.kommando;

import java.util.ArrayList;
import java.util.List;

class Aufrufer {
    private List<Kommando> verlauf = new ArrayList<>();

    void speichernUndAusfuehren(Kommando kommando) {
        this.verlauf.add(kommando);
        kommando.ausfuehren();
    }

    List<Kommando> getVerlauf() {
        return verlauf;
    }
}
