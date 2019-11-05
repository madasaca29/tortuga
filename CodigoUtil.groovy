http://docs.groovy-lang.org/latest/html/api/groovy/util/XmlSlurper.html

def document = new XmlSlurper().parseText(xml)

println document.'*'*.depthFirst()
println document.'*'*.name()
println document.first().name
println document.first().text()
println document.name()

document.depthFirst().each{node->
	println node.name().toString()
}
