package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/* ======================================================================================================================== */
// Desafio 2
// Conversão de Tempo

/*
Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
dia/mês/ano horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

- Obs

Utilize UTC (GMT-0)

- Exemplo:
    Entrada: 1693225566
    Saída: 28/Aug/2023 12:26:06
*/

public class bpm2_02 {
    public static void main(String[] args) {
        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Digite o número unix para converter para data humana\n");
        Scanner entrada = new Scanner(System.in);
        long unixTimestamp = entrada.nextLong();

        //long unixTimestamp = 1693225566L;

        LocalDateTime dataConvertida = LocalDateTime.ofInstant(
                Instant.ofEpochSecond(unixTimestamp),
                ZoneId.of("UTC")
        );

        String dataFinal = formatador.format(Date.from(dataConvertida.atZone(ZoneId.of("UTC")).toInstant()));

        System.out.println(dataFinal);
    }
}
