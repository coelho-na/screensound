package br.com.alura.screensound.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;


public class ConsultaGemini {
    public static String obterInformacao(String texto){
        Client client = new Client();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash",
                        "me fale resumidamente sobre o artista " + texto,
                        null);


        return response.text().trim();
    }
}
