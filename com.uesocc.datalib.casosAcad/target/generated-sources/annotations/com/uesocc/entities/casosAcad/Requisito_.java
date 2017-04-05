package com.uesocc.entities.casosAcad;

import com.uesocc.entities.casosAcad.TipoRequisito;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T15:48:28")
@StaticMetamodel(Requisito.class)
public class Requisito_ { 

    public static volatile SingularAttribute<Requisito, String> descripcion;
    public static volatile SingularAttribute<Requisito, Integer> idRequisito;
    public static volatile SingularAttribute<Requisito, String> nombre;
    public static volatile SingularAttribute<Requisito, TipoRequisito> idTipoRequisito;
    public static volatile SingularAttribute<Requisito, String> prioridad;

}