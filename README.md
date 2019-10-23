# Zual-proxy
zuul api gateway pattern

Zuul has mainly four types of filters that enable us to intercept the traffic in different timeline of the request processing for any particular transaction. We can add any number of filters for a particular url pattern.

pre filters – are invoked before the request is routed.
post filters – are invoked after the request has been routed.
route filters – are used to route the request.
error filters – are invoked when an error occurs while handling the request.


