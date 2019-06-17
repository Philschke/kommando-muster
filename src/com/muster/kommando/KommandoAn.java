package com.muster.kommando;

class KommandoAn extends Kommando {
    private Licht dasLicht;

    KommandoAn(Licht dasLicht) {
        this.dasLicht = dasLicht;
    }

    @Override
    void ausfuehren() {
        this.dasLicht.lichtAn();
    }
}
