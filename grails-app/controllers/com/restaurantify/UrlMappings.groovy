package com.restaurantify

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        group "/cesta", {
            post "/agregar"(controller: "cesta", action: "agregar")
            put "/modificar"(controller: "cesta", action: "modificar")
            get "/"(controller: "cesta", action: "listar")
            delete "/$id"(controller: "cesta", action: "eliminar")
        }

        group "/pedidos", {
            get "/lista/$estado"(controller:  "pedido", action: "pedidos")
            put "/estado"(controller:  "pedido", action: "modificarEstado")
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
