package com.credibanco.assessment.card.response;

import lombok.Data;

@Data
public class TarjetaResponse {
    private String codigoRespuesta;
    private String mensaje;
    private int numeroValidacion;
    private String panEnmascarado;
}
