/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.programacionreactiva;

import java.util.Scanner;
import reactor.core.publisher.Flux;

public class ProgramacionReactiva {

    public static void main(String[] args) {
        Flux.just(1, 2, 3)
            .map(i -> {
                System.out.print("Número " + i + ": ");
                return new Scanner(System.in).nextDouble();
            })
            .collectList()
            .map(nums -> nums.stream().mapToDouble(Double::doubleValue).average().orElse(0))
            .subscribe(promedio -> System.out.println("Promedio: " + promedio));
    }
}
        
      

