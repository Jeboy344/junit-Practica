package org.example.classes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {


    private Usuario usuario;


    @Before
    public void setUp(){
        usuario = new Usuario("Juan", "Pérez");
    }

    @Test
    public void testGetNombre(){
        assertEquals("Juan", usuario.getNombre());
    }

    @Test
    public void testGetApellido(){
        assertEquals("Pérez", usuario.getApellido());
    }

    @Test
    public void testToString(){
        assertEquals("Nombre: Juan, Apellido: Pérez", usuario.toString());
    }

}
