package br.com.wesleysouza.cinetrack.service;

public interface IconverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
