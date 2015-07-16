# play-basic-routing
You will get here different ways of defining play routing. Following are the details :
#### Basic routing
GET   /                    controllers.Application.index

#### Simple and static routing
GET   /simple              controllers.Application.simple

#### Dynamic routing with type defined (id:Int)
GET   /client/:id          controllers.Application.clientId(id:Int)

#### Dynamic routing with no type defined (name)
GET   /user/:name          controllers.Application.userName(name)

#### Dynamic parts spanning several
GET   /files/*name         controllers.Application.file(name)

#### Dynamic parts with custom regular expressions
GET   /items/$id<[0-5]+>   controllers.Application.items(id: Long)

#### Extract the page parameter from the path.
GET   /show/:page          controllers.Application.showFromPath(page)

#### Extract the page parameter from the query string.
GET   /show                controllers.Application.showFromQueryString(page)

#### Make the value fix for page parameter
GET   /showfix             controllers.Application.showFix(page = "home")

#### Parameter with default values
GET   /clients             controllers.Application.clientList(page: Int ?= 1)

#### Parameter with optional value
GET   /list                controllers.Application.list(dept : Option[Int])
