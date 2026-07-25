package br.com.vini.spring_boot_essentials.exception;

public class NotFoundException extends Exception{

    public NotFoundException(String mensage) {
        super(mensage);
    }
}
