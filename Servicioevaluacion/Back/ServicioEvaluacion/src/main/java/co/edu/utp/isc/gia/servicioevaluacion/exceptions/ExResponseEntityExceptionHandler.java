/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.exceptions;

import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.BadRequestException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InternalServerErrorException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.NotContentException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.NotFoundException;
import co.edu.utp.isc.gia.servicioevaluacion.exceptions.responses.InvalidParameterException;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author Michael
 */
@ControllerAdvice
@RestController
public class ExResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<ResponseException> handleNotFoundException(NotFoundException ex, WebRequest request) {
        ResponseException exceptionResponse = new ResponseException(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NotContentException.class)
    public final ResponseEntity<ResponseException> handleNoContentException(NotContentException ex, WebRequest request) {
        ResponseException exceptionResponse = new ResponseException(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.NO_CONTENT);
    }


    @ExceptionHandler(BadRequestException.class)
    public final ResponseEntity<ResponseException> handleBadRequestException(BadRequestException ex, WebRequest request) {
        ResponseException exceptionResponse = new ResponseException(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(InternalServerErrorException.class)
    public final ResponseEntity<ResponseException> handleInternalServerErrorException(InternalServerErrorException ex, WebRequest request) {
        ResponseException exceptionResponse = new ResponseException(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
            
    @ExceptionHandler(InvalidParameterException.class)
    public final ResponseEntity<ResponseException> handleInternalServerErrorException(InvalidParameterException ex, WebRequest request) {
        ResponseException exceptionResponse = new ResponseException(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
