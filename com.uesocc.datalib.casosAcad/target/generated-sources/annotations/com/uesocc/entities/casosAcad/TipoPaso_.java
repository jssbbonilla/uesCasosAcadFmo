package com.uesocc.entities.casosAcad;

import com.uesocc.entities.casosAcad.Paso;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T15:48:28")
@StaticMetamodel(TipoPaso.class)
public class TipoPaso_ { 

    public static volatile SingularAttribute<TipoPaso, Integer> idTipoPaso;
    public static volatile SingularAttribute<TipoPaso, String> descripcion;
    public static volatile ListAttribute<TipoPaso, Paso> pasoList;
    public static volatile SingularAttribute<TipoPaso, String> nombre;
    public static volatile SingularAttribute<TipoPaso, Boolean> activo;

}