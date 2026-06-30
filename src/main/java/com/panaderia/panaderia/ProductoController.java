package com.panaderia.panaderia;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador encargado de gestionar los productos.
 */
@Controller
public class ProductoController {

    /**
     * Muestra el formulario principal.
     */
    @GetMapping("/")
    public String inicio(Model model) {

        model.addAttribute("producto", new Producto());

        return "index";
    }

    /**
     * Procesa el formulario enviado.
     */
    @PostMapping("/guardar")
    public String guardarProducto(
            @ModelAttribute Producto producto,
            Model model) {

        model.addAttribute("producto", producto);

        return "resultado";
    }
}