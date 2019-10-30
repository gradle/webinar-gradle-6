withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        if (classNode.name.contains('Slow')) {
            // println "Slow compile of $classNode"
            Thread.sleep(15_000)
        }
    }
}
