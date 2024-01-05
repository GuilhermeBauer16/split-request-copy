package guilhermeBauer.github.splitrequestcopy.exceptions;

import org.springframework.http.HttpStatus;
public enum ErroHandler {

    CONSTRUCTOR_DEFAULT_UNDEFINED("Classe [ %s ] deve declarar um construtor padrão.", HttpStatus.NOT_IMPLEMENTED),
    PERSON_CONSTRAINTS("Ocorreu um erro com as validações relacionadas ao consumidor: [ %s ].", HttpStatus.BAD_REQUEST),
    ORDER_FAILED("Houve um erro no fechamento do pedido: [ %s ].", HttpStatus.BAD_REQUEST),
    INVOICE_FAILED("Ocorreu uma falha durante a execução do cálculo da fatura: [ %s ].", HttpStatus.BAD_REQUEST),
    EMAIL_SEND_FAILURE("Falha ao enviar o email de notificação para: [ %s ].", HttpStatus.SERVICE_UNAVAILABLE),
    CLASS_MAPPING_FAILURE("Falha ao tentar mapear a classe [ %s ].", HttpStatus.INTERNAL_SERVER_ERROR);

    private final String message;
    private final HttpStatus httpStatus;

    ErroHandler(String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
