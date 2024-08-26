class Pregunta {
    private String pregunta;
    private String[] respuestas;
    private int opcionCorrecta;

    // Constructor
    public Pregunta(String pregunta, String[] respuestas, int opcionCorrecta) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
        this.opcionCorrecta = opcionCorrecta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public boolean esRespuestaCorrecta(int opcionSeleccionada) {
        return opcionSeleccionada == opcionCorrecta;
    }

    public int getOpcionCorrecta() {
        return opcionCorrecta;
    }
}
