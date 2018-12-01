<template>
    <div class="vue-text">
        <h1 class="text-center" style="text-align: center">Text Rendering</h1>
        <div class="container-fluid">
            <div class="container-fluid">
                <ul v-if="results && results.length">
                    <div class="col-md-8 blog-main">
                        <div class="container-border container" v-for="result in results">
                            <div class="blog-post">
                                <h2 class="blog-post-title" :id="`A${result.ID}_title`">{{ result.title }}</h2>
                                <p class="blog-post-meta">by <a href="#" :id="`A${result.ID}_author`">{{ result.author }}</a></p>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <p :id="`A${result.ID}_article`"> {{ result.article }}</p>
                                </div>
                            </div>
                            <hr>
                        </div>
                    </div>
                </ul>
                <ul v-if="errors && errors.length">
                    <li v-for="error of errors">
                        {{error.message}}
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
    import axios from 'axios';

    export default {
        name: "vue-text",
        data() {
            return {
                results: [],
                errors: []
            }
        },
        mounted() {
            axios.get("http://152.46.17.4:8080/pyapi/articles").then(response => {
                this.results = response.data;
            }).catch(e => {
                this.errors.push(e)
            })
        }
    }
</script>