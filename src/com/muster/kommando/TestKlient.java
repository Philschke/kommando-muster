package com.muster.kommando;

class TestKlient {

    private Licht licht = new Licht();
    private Kommando kmdAn = new KommandoAn(licht);
    private Kommando kmdAus = new KommandoAus(licht);
    private Aufrufer aufrufer = new Aufrufer();

    void testMethode(String kommando) {
        switch (kommando) {
            case "ON":
                aufrufer.speichernUndAusfuehren(kmdAn);
                //System.out.println(aufrufer.getVerlauf());
                break;
            case "OFF":
                aufrufer.speichernUndAusfuehren(kmdAus);
                //System.out.println(aufrufer.getVerlauf());
                break;
                default:
                    System.out.println("Nur die Argumente ON oder OFF sind erlaubt.");
        }
    }

}
