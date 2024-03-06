import java.util.List;

class Strategia1 implements ListanMuuttaja {
    @Override
    public String muunnaListaMerkkijonoksi(List<String> lista) { // Rivinvaihto jokaisen alkion jälkeen
        StringBuilder tulos = new StringBuilder();
        for (String alkio : lista) {
            tulos.append(alkio).append("\n");
        }
        return tulos.toString();
    }
}

class Strategia2 implements ListanMuuttaja {
    @Override
    public String muunnaListaMerkkijonoksi(List<String> lista) { // Rivinvaihto joka toisen alkion jälkeen
        StringBuilder tulos = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            tulos.append(lista.get(i));
            if (i % 2 == 1) {
                tulos.append("\n");
            } else {
                tulos.append(" ");
            }
        }
        return tulos.toString();
    }
}

class Strategia3 implements ListanMuuttaja { // Rivinvaihto joka kolmannen alkion jälkeen
    @Override
    public String muunnaListaMerkkijonoksi(List<String> lista) {
        StringBuilder tulos = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            tulos.append(lista.get(i));
            if (i % 3 == 2) {
                tulos.append("\n");
            } else {
                tulos.append(" ");
            }
        }
        return tulos.toString();
    }
}
