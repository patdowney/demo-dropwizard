The simplest simple dropwizard demo.

The point is only to create a service that listens on a port and responds to something.

e.g. `http://localhost:8080/current-time`

It also creates a debian package using Netflix's nebula ospackage gradle plugin.

It expects `daemontools` to already be running and configured to monitor `/service`.

On Ubuntu machines this means `apt-get install daemontools-run` and then "mkdir /service && rmdir /etc/service && ln -sf /service /etc/service && service daemontools restart". If there's an easier way add a pull request!

Designed to be used in conjunction with `github.com/patdowney/demo-puppet`
