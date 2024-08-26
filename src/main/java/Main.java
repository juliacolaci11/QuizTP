public class Main {
    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        Pregunta p1 = new Pregunta(
                "¿Cuándo salió campeón por primera vez Argentina en un mundial?",
                new String[]{"1930", "1978", "1986", "1990"},
                1 // La respuesta correcta es 1978
        );

        Pregunta p2 = new Pregunta(
                "¿En qué año se descubrió América?",
                new String[]{"1492", "1500", "1600", "1700"},
                0 // La respuesta correcta es 1492
        );

        Pregunta p3 = new Pregunta(
                "¿Quién de estos escritores recibió un premio Nobel?",
                new String[]{"Jorge Luis Borges", "Gabriel García Márquez", "Julio Cortázar", "Pablo Neruda"},
                3 // La respuesta correcta es Pablo Neruda
        );

        Pregunta p4 = new Pregunta(
                "¿Qué día murió el General José de San Martin?",
                new String[]{"17 de agosto de 1850", "9 de julio de 1816", "25 de mayo de 1810", "12 de octubre de 1492"},
                0 // La respuesta correcta es 17 de agosto de 1850
        );

        quiz.agregarPregunta(p1);
        quiz.agregarPregunta(p2);
        quiz.agregarPregunta(p3);
        quiz.agregarPregunta(p4);

        quiz.iniciarQuiz();
    }
}