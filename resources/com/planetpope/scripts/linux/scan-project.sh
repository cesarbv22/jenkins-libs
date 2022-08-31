 sh $1/bin/sonar-scanner \
                          -Dsonar.projectKey=SimpleExpressExample:Test \
                          -Dsonar.projectName=SimpleExpressExample \
                          -Dsonar.projectVersion=0.0.$2 \
                          -Dsonar.host.url=http://mysonarqube:9000 \
                          -Dsonar.sources=./$3/app.js,./$3/config/db.config.js,./$3/routes/developers.js \
                          -Dsonar.login=admin \
                          -Dsonar.password=admin \
                          -Dsonar.tests=./$3/test \
                          -Dsonar.javascript.lcov.reportPaths=./$3/coverage/lcov.info