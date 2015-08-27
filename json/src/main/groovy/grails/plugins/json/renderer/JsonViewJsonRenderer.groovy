package grails.plugins.json.renderer

import grails.core.support.proxy.ProxyHandler
import grails.rest.render.Renderer
import grails.rest.render.RendererRegistry
import grails.views.mvc.renderer.DefaultViewRenderer
import grails.web.mime.MimeType
import groovy.transform.CompileStatic
import org.springframework.web.servlet.ViewResolver

/**
 * A renderer that will lookup a JSON view if it exists and render it, otherwise fallback to default
 *
 * @author Graeme Rocher
 * @since 1.0
 */
@CompileStatic
class JsonViewJsonRenderer<T> extends DefaultViewRenderer<T> {


    JsonViewJsonRenderer(Class<T> targetType, ViewResolver viewResolver, ProxyHandler proxyHandler, RendererRegistry rendererRegistry, Renderer defaultRenderer) {
        super(targetType, MimeType.JSON, viewResolver, proxyHandler, rendererRegistry, defaultRenderer)
    }

    JsonViewJsonRenderer(Class<T> targetType, MimeType mimeType, ViewResolver viewResolver, ProxyHandler proxyHandler, RendererRegistry rendererRegistry, Renderer defaultRenderer) {
        super(targetType, mimeType, viewResolver, proxyHandler, rendererRegistry, defaultRenderer)
    }

}
