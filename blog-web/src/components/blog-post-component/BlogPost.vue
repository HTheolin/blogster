<template>
    <div id="blogs-table">
        <p>Blog post</p>
        <h1>{{ msg }}</h1>
        <div v-for="blog of blogs" v-bind:key="blog.id">
            <p>{{ blog }}</p>
            <h1>{{ blogger }}</h1>
        </div>


    </div>
</template>

<script>
    export default {
        name: 'BlogPost',
        blogger: 'Mr Miagi',
        props: {
            msg: String,
            blogs: Array,
            blogger: String,
        },
        data() {
            return {
                blogs: []
            }
        },

        mounted() {
          this.getBlogPosts()
        },

        methods: {

            async getBlogPosts() {
                try {
                    restPath = process.env.HOST + process.env.BASE_REST_PATH
                    const response = await fetch(restPath + '/blogs/123')
                    const data = await response.json()
                    this.blogs = data
                } catch (e) {
                    console.error(e)
                }

            }

        },
    }


</script>

<style scoped>

</style>