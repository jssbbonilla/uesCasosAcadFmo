package com.uesocc.entities.casosAcad;

import com.uesocc.entities.casosAcad.Requisito;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-28T15:48:28")
@StaticMetamodel(TipoRequisito.class)
public class TipoRequisito_ { 

    public static volatile SingularAttribute<TipoRequisito, String> observaciones;
    public static volatile SingularAttribute<TipoRequisito, Integer> idTipoRequisito;
    public static volatile SingularAttribute<TipoRequisito, String> nombre;
    public static volatile ListAttribute<TipoRequisito, Requisito> requisitoList;
    public static volatile SingularAttribute<TipoRequisito, Boolean> activo;

}