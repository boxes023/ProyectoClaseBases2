/*
Copyright [2014] [cajas]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package BD;

/**
 *
 * @author cajas
 */
public class Campo {
    private String nombre;
    private String tipoDato;

    public Campo(String nombre, String tipoDato){
        this.nombre = nombre;
        this.tipoDato = tipoDato;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getTipoDato() {
        return tipoDato;
    }   
}
