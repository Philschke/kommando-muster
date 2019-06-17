package com.muster.kommando;

class KommandoAus extends Kommando{
    private Licht dasLicht;

    KommandoAus(Licht dasLicht) {
        this.dasLicht = dasLicht;
    }

    @Override
    void ausfuehren() {
        this.dasLicht.lichtAus();
    }
}
