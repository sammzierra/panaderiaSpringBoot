package com.panaderia.panaderia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Controlador encargado del módulo de ventas.
 */
@Controller
public class VentaController {

    /**
     * Muestra el formulario para registrar una venta.
     */
    @GetMapping("/ventas")
    public String mostrarFormularioVenta(Model model) {

        model.addAttribute("venta", new Venta());

        return "venta";
    }

    /**
     * Procesa la información de la venta.
     */
    @PostMapping("/registrarVenta")
    public String registrarVenta(@ModelAttribute Venta venta, Model model) {

        model.addAttribute("venta", venta);

        return "resultadoVenta";
    }
}