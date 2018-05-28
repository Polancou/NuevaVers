/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import sys.model.pacientes.AnalisisOclusion;
import sys.model.pacientes.Atm;
import sys.model.pacientes.DireccionPaciente;
import sys.model.pacientes.ExamenOral;
import sys.model.pacientes.ExamenOrofacial;
import sys.model.pacientes.HallazgosRadiograficos;
import sys.model.pacientes.MedicoPaciente;
import sys.model.pacientes.Paciente;
import sys.model.pacientes.PreguntasPaciente;
import sys.model.pacientes.TrabajoPaciente;

/**
 *
 * @author Ramses Mtnz Santiago
 */
public interface daoNuevoPaciente {
    
    public boolean datosPersonales(Paciente paciente,MedicoPaciente medico,DireccionPaciente direccion,TrabajoPaciente trabajo);
    
    public boolean cuestionario(PreguntasPaciente preguntas);
    
    public boolean examenOrofacial ();
    
}
